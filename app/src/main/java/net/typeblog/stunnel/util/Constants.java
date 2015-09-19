package net.typeblog.stunnel.util;

public class Constants
{
	public static final String HOME = "/data/data/net.typeblog.stunnel/files/";
	public static final String EXECTUABLE = "stunnel";
	public static final String CONFIG = "config";
	public static final String PID = "pid";
	public static final String LOG = "log";
	
	public static final String DEF_CONFIG = "# Do not change the following lines\n" +
							"log = overwrite\noutput = " + HOME + LOG + "\n" +
							"pid = " + HOME + PID + "\n\n# Now add your configs\n";
}
