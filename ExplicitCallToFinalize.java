package javacodechecker;

public class ExplicitCallToFinalize {
    public void methodCall(){

        // EMB-ISSUE: CodeIssueNames.EXPLICIT_CALL_TO_FINALIZE
        object1.finalize();

        // EMB-ISSUE: CodeIssueNames.EXPLICIT_CALL_TO_FINALIZE/no-detect
        super.finalize();


        // EMB-ISSUE: CodeIssueNames.EXPLICIT_CALL_TO_FINALIZE/no-detect
        object2 = null;
        // EMB-ISSUE: CodeIssueNames.EXPLICIT_CALL_TO_FINALIZE/no-detect
        object1.methodCall();



    }
}