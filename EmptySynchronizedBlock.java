package javacodechecker;

public class EmptySynchronizedBlock {

    public static void helperBad() {
        // EMB-ISSUE: CodeIssueNames.EMPTY_SYNCHRONIZED_BLOCK
        synchronized (CWE585_Empty_Sync_Block__Servlet_01.class) {

        }
        intBad = intBad * 2;
    }

    public static void helperBad3() {
        intBad = intBad * 2;
        // EMB-ISSUE: CodeIssueNames.EMPTY_SYNCHRONIZED_BLOCK
        synchronized (CWE585_Empty_Sync_Block__Servlet_02.class) {
            //empty
        }

    }

    public static void helperGood1() {
        // EMB-ISSUE: CodeIssueNames.EMPTY_SYNCHRONIZED_BLOCK/no-detect
        synchronized (CWE585_Empty_Sync_Block__Servlet_03.class) {
            intGood1 = intGood1 * 2;
        }
    }
}
