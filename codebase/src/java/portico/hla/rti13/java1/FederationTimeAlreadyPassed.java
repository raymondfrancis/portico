package hla.rti13.java1;

public class FederationTimeAlreadyPassed extends RTIexception
{
	private static final long serialVersionUID = 98121116105109L;
	
	public FederationTimeAlreadyPassed( String reason )
	{
		super( reason );
	}

	public FederationTimeAlreadyPassed( String reason, int serial )
	{
		super( reason, serial );
	}
	
	public FederationTimeAlreadyPassed()
    {
	    super();
    }

    /**
     * @param cause The cause of the exception
     */
    public FederationTimeAlreadyPassed( Throwable cause )
    {
	    super( cause );
    }

    /**
     * @param message The message to create the exception with
     * @param cause The cause of the exception
     */
    public FederationTimeAlreadyPassed( String message, Throwable cause )
    {
	    super( message, cause );
    }
}
