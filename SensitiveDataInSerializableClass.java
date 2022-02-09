package javacodechecker;
// EMB-ISSUE: CodeIssueNames.SENSITIVE_DATA_IN_SERIALIZABLE_CLASS
public class SensitiveDataInSerializableClass implements Serializable
{
    private String passwordHash;

    protected void setPassword(String password)
    {
        passwordHash = password;
    }

    protected String getPassword()
    {
        return passwordHash;
    }

    protected void withdraw(float amount) throws SQLException
    {
        if (passwordHash != null)
        {
            Connection connection = DriverManager.getConnection("192.168.39.10", "sa", passwordHash);


            if (connection != null)
            {
                try
                {
                    connection.close();
                }
                catch (SQLException exceptSql)
                {
                    IO.logger.log(Level.WARNING, "Error closing Connection", exceptSql);
                }
            }
        }
        else
        {
            IO.logger.log(Level.WARNING, "Invalid password.");
        }
    }
}