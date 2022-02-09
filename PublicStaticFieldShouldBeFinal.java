package javacodechecker;

public class PublicStaticFieldShouldBeFinal {
    // EMB-ISSUE: CodeIssueNames.PUBLIC_STATIC_FIELD_SHOULD_BE_FINAL
    public static String appPropertiesFile = "app/Application.properties";
    // EMB-ISSUE: CodeIssueNames.PUBLIC_STATIC_FIELD_SHOULD_BE_FINAL
    public static String DEFAULT_ERROR = "The value you entered was not understood. Please try again.";
    // EMB-ISSUE: CodeIssueNames.PUBLIC_STATIC_FIELD_SHOULD_BE_FINAL/no-detect
    public static final String appProperties = "app/Application.properties";
}