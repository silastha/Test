package automation.selenium.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import automation.selenium.framework.Browser;

public class SetupTests  
{

	/* Global Variable Declaration */
	
	private String url = "http://lav.thaiba:G1nT0n!C2016@nucleus.dev.itonicsit.de/user";
	protected static String workingDir = System.getProperty("user.dir");

	protected static WebDriver driver;	
	protected String entityForm = workingDir + "\\src\\main\\resources\\entity-form.txt";
    protected String sCurrentLine;
    protected String storeUsername;
    protected String storePassword;
    protected String storeInfo;
    protected String browsersTest;
    protected String storeBrowser;
    protected String actualText;
    protected String expectedText;
    protected String actualErrorMsg;
    protected String expectedErrorMsg;
    protected int counter = 0;
    protected String fileName =	workingDir+"\\src\\main\\resources\\select-browser.txt";
    protected String userDetails = workingDir+"\\src\\main\\resources\\user-details.txt";
    protected BufferedReader br;
    
	public String selectImgPath = workingDir+"\\src\\main\\resources\\autoit\\chooseImg.exe"; 
	public static String chromeDriverPath = workingDir + "\\src\\main\\resources\\chromedriver.exe";
    public static String firefoxDriverPath = workingDir + "\\src\\main\\resources\\geckodriver.exe";

    
    
	
	
    @BeforeMethod
    public void beforeMethod() {
  	  
    	try {
    	 br = new BufferedReader(new FileReader(fileName));

         while ((sCurrentLine = br.readLine()) != null) {
             counter++;
             if (sCurrentLine.equals("#selectBrowserBelow")) 
             {
                 storeBrowser = br.readLine();
                 break;
             }
         }
     } 
     catch (IOException e) 
     {
         System.out.println("Exception " + e);

     } 
     finally 
     {
         try 
         {
             if (br != null) 
             {
                 br.close();
             }
         } 
         catch (IOException ex) 
         {
             ex.printStackTrace();
         }
     }
    	
    	
    	
    	browsersTest = storeBrowser;
        System.out.println("Running in " + browsersTest + ".");
        try 
        {
            if (browsersTest.equals("chrome")) 
            {
            	 driver = Browser.Chrome(driver);

                 //driver.manage().window().maximize();
            	 driver.get(url);
               
                

            } 
            else if (browsersTest.equals("firefox")) 
            {

           	 driver = Browser.Firefox(driver);

             //   driver.manage().window().maximize();
                driver.get(url);

            } 
            else if (browsersTest.equals("iexplorer")) 
            {


           	 driver = Browser.IE(driver);

              //  driver.manage().window().maximize();
                driver.get(url);

            }
            else if (browsersTest.equals("htmlunit")) 
            {
            
           // 	driver = new HtmlUnitDriver(true);
          //      driver.manage().window().maximize();
                driver.get(url);
               // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            } 
            else 
            {
                System.out.println("Exception Occur!! Please enter the proper driver name.\n Note: It is case-sensitive!!");
            }
        } 
        catch (NullPointerException e) 
        {
            	System.out.println("exception occur because No driver name given!!");
        }
    }
    	
    	

    @AfterMethod
    public void afterMethod() 
    {
  	  driver.close();
  	  driver.quit();
    }

    
//custom methods for file 

	
    public String getUsername()
	{
    	
		try 
	       {
	           br = new BufferedReader(new FileReader(userDetails));

	           while ((sCurrentLine = br.readLine()) != null) {
	               counter++;
	               if (sCurrentLine.equals("#username")) 
	               {
	            	   storeInfo = br.readLine();
	                   break;
	               }
	           }
	       } 
	       catch (IOException e) 
	       {
	           System.out.println("Exception " + e);

	       } 
	       finally 
	       {
	           try 
	           {
	               if (br != null) 
	               {
	                   br.close();
	               }
	           } 
	           catch (IOException ex) 
	           {
	               ex.printStackTrace();
	           }
	       } 
		   return storeInfo;
		
	}
    
    
//custom methods for file 
	
    public String getPassword()
	{
		try 
	       {
	           br = new BufferedReader(new FileReader(userDetails));

	           while ((sCurrentLine = br.readLine()) != null) {
	               counter++;
	               if (sCurrentLine.equals("#password")) 
	               {
	            	   storeInfo = br.readLine();
	                   break;
	               }
	           }
	       } 
	       catch (IOException e) 
	       {
	           System.out.println("Exception " + e);

	       } 
	       finally 
	       {
	           try 
	           {
	               if (br != null) 
	               {
	                   br.close();
	               }
	           } 
	           catch (IOException ex) 
	           {
	               ex.printStackTrace();
	           }
	       } 
		   return storeInfo;
	}
    
    
    
    
  //get entity title
  	 public String getTitle()
  		{
  			try 
  		       {
  		           br = new BufferedReader(new FileReader(entityForm));

  		           while ((sCurrentLine = br.readLine()) != null) {
  		               counter++;
  		               if (sCurrentLine.equals("#title")) 
  		               {
  		            	   storeInfo = br.readLine();
  		                   break;
  		               }
  		           }
  		       } 
  		       catch (IOException e) 
  		       {
  		           System.out.println("Exception " + e);

  		       } 
  		       finally 
  		       {
  		           try 
  		           {
  		               if (br != null) 
  		               {
  		                   br.close();
  		               }
  		           } 
  		           catch (IOException ex) 
  		           {
  		               ex.printStackTrace();
  		           }
  		       } 
  			   return storeInfo;
  		}
  	 
  	 
  	 // get entity segment
  	public String getmegaTrendSegment()
		{
			try 
		       {
		           br = new BufferedReader(new FileReader(entityForm));

		           while ((sCurrentLine = br.readLine()) != null) {
		               counter++;
		               if (sCurrentLine.equals("#segment")) 
		               {
		            	   storeInfo = br.readLine();
		                   break;
		               }
		           }
		       } 
		       catch (IOException e) 
		       {
		           System.out.println("Exception " + e);

		       } 
		       finally 
		       {
		           try 
		           {
		               if (br != null) 
		               {
		                   br.close();
		               }
		           } 
		           catch (IOException ex) 
		           {
		               ex.printStackTrace();
		           }
		       } 
			   return storeInfo;
		}

  	 
  	 
  	 
    
    // get entity abstract 
  	public String getAbstract()
		{
			try 
		       {
		           br = new BufferedReader(new FileReader(entityForm));

		           while ((sCurrentLine = br.readLine()) != null) {
		               counter++;
		               if (sCurrentLine.equals("#abstract")) 
		               {
		            	   storeInfo = br.readLine();
		                   break;
		               }
		           }
		       } 
		       catch (IOException e) 
		       {
		           System.out.println("Exception " + e);

		       } 
		       finally 
		       {
		           try 
		           {
		               if (br != null) 
		               {
		                   br.close();
		               }
		           } 
		           catch (IOException ex) 
		           {
		               ex.printStackTrace();
		           }
		       } 
			   return storeInfo;
		}
  	 
  	// get entity description
  	public String getDescription()
	{
		try 
	       {
	           br = new BufferedReader(new FileReader(entityForm));

	           while ((sCurrentLine = br.readLine()) != null) {
	               counter++;
	               if (sCurrentLine.equals("#description")) 
	               {
	            	   storeInfo = br.readLine();
	                   break;
	               }
	           }
	       } 
	       catch (IOException e) 
	       {
	           System.out.println("Exception " + e);

	       } 
	       finally 
	       {
	           try 
	           {
	               if (br != null) 
	               {
	                   br.close();
	               }
	           } 
	           catch (IOException ex) 
	           {
	               ex.printStackTrace();
	           }
	       } 
		   return storeInfo;
	}
  	
  	
  	// get entity tags
  	public String getTags()
	{
		try 
	       {
	           br = new BufferedReader(new FileReader(entityForm));

	           while ((sCurrentLine = br.readLine()) != null) {
	               counter++;
	               if (sCurrentLine.equals("#tags")) 
	               {
	            	   storeInfo = br.readLine();
	                   break;
	               }
	           }
	       } 
	       catch (IOException e) 
	       {
	           System.out.println("Exception " + e);

	       } 
	       finally 
	       {
	           try 
	           {
	               if (br != null) 
	               {
	                   br.close();
	               }
	           } 
	           catch (IOException ex) 
	           {
	               ex.printStackTrace();
	           }
	       } 
		   return storeInfo;
	}
  	
  	
    


	/*public void setupBrowser () 
    {

        try 
        {
            br = new BufferedReader(new FileReader(fileName));

            while ((sCurrentLine = br.readLine()) != null) {
                counter++;
                if (sCurrentLine.equals("#SelectBrowserBelow")) 
                {
                    storeBrowser = br.readLine();
                    break;
                }
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Exception " + e);

        } 
        finally 
        {
            try 
            {
                if (br != null) 
                {
                    br.close();
                }
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }

        browsersTest = storeBrowser;
        System.out.println("Running in " + browsersTest + ".");
        try 
        {
            if (browsersTest.equals("chrome")) 
            {

                System.setProperty("webdriver.chrome.driver", "F:\\projects\\driverchrome\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(url);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                

            } 
            else if (browsersTest.equals("firefox")) 
            {
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(url);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            } 
            else if (browsersTest.equals("iexplorer")) 
            {

                System.setProperty("webdriver.ie.driver", "c:\\projectDrivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
                driver.get(url);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            }
            else if (browsersTest.equals("htmlunit")) 
            {
            
            	driver = new HtmlUnitDriver(true);
                driver.manage().window().maximize();
                driver.get(url);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            } 
            else 
            {
                System.out.println("you are not activating any of the drivers");
            }
        } 
        catch (NullPointerException e) 
        {
            	System.out.println("exception occur");
        }
    }
    

    public void closeAndExitBrowser () 
    {

        try 
        {
            driver.close();
            driver.quit();
        } 
        catch (NullPointerException e) 
        {
            System.out.println("No browser loaded!!");
        }
    }*/
}
