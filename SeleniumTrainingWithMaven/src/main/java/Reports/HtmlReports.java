package Reports;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlReports {

	public void createhtmlreport(List<String> step) throws IOException{
		
		System.out.println(" Lets write our own report");
		
		String rep1="<html>"
+"<body>"
		+"<div id=tablereport>"
+"<table>"
+"<tbody>"
+"<th> REPORT </th>";
//
		String rep2 = null;
for (int i=0;i<step.size();i++){
	rep2=rep2+"<tr>"+step.get(i)+"</tr><br>";

		
}

String rep3="</tbody>"
+"</table>"
+"</div>"
+"</body>"
+"</html>";

String htmlrep=rep1+rep2+rep3;

//File file = new File("D://REPORTSNIMBLE//htmlreport.html");
//// if file doesnt exists, then create it
//if (!file.exists()) {
//  file.createNewFile();
//}

File file = new File("D://REPORTSNIMBLE");
file.mkdir();
FileWriter fw = new FileWriter(file+"/htmlreport.html");
//BufferedWriter bw = new BufferedWriter(fw);
fw.write(htmlrep);
fw.close();
	}
	
//	public static void main(String[] args) throws IOException {
//		HtmlReports rep=new HtmlReports();
//		rep.createhtmlreport();
//	}
}
