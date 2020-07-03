import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexExtract {
	
	  public static void main(String[] args) {
	    try {
	      File myObj = new File("");
	      Pattern pattern = Pattern.compile("CPF [(][0-9]{11}[)]"); //Somente numero de 11 posicoes: [0-9]{11}
	      BufferedReader br = new BufferedReader(new FileReader(myObj));
	      String line;
	      
			while((line = br.readLine()) != null ){
				Matcher matcher = pattern.matcher(line);
		        if (matcher.find())
		        {
		            System.out.println(matcher.group());
		        }
			  }
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	 
	    }
	  }