class VotingApp {

    // Method to check voting eligibility
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {

        VotingApp app = new VotingApp();

        // Test cases
        int[] ages = {16, 18, 25};

        for (int age : ages) {
            System.out.println("\nChecking age: " + age);

            try {
                app.checkEligibility(age);
            } 
            catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } 
            finally {
                System.out.println("Validation process completed");
            }
        }
    }
}
