public class TeamLead extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Team Lead approved the expense request.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}