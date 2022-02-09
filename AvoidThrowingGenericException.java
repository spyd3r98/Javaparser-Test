package javacodechecker;

public class AvoidThrowingGenericException {
    // EMB-ISSUE: CodeIssueNames.AVOID_THROWING_GENERIC_EXCEPTION
    public void M1()throws Exception{
        logger.info("Throwing generic exception");
    }
    // EMB-ISSUE: CodeIssueNames.AVOID_THROWING_GENERIC_EXCEPTION
    public void M2()throws Throwable{
        logger.info("Throwing generic exception");
    }
    // EMB-ISSUE: CodeIssueNames.AVOID_THROWING_GENERIC_EXCEPTION/no-detect
    public void M3()throws  InvocationTargetException{
        logger.info("Throwing InvocationTargetException");
    }

    // EMB-ISSUE: CodeIssueNames.AVOID_THROWING_GENERIC_EXCEPTION/no-detect
    public void M5()throws IOException, InvocationTargetException, SQLException{
        logger.info("Throwing IOException, InvocationTargetException, SQLException");
    }
    // EMB-ISSUE: CodeIssueNames.AVOID_THROWING_GENERIC_EXCEPTION
    public void M6()throws Error{
        logger.info("Throwing Error");
    }
}