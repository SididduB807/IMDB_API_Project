import javax.accessibility.AccessibleTable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;


import org.json.JSONObject;

public class APExamPractice {
    public static void main(String args[]) {

        HttpsURLConnection aconnection = null;

        //System.out.println("Genre Choices: Action, Drama, Comedy, Horror, Romance");
       //Scanner choosegenre = new Scanner(System.in);
       //System.out.println("Enter a Genre from the list: ");
       //String userGenre = choosegenre.nextLine();
        // comparing user input to Genres from the list



        String urltext = "https://imdb-api.com/API/AdvancedSearch/k_sx6fek9v/?genres=action";
        try {
         //   TrustManager[] trustAllCerts = new TrustManager[]{
           //         new X509TrustManager() {
             //           public X509Certificate[] getAcceptedIssuers() {
               //             X509Certificate[] myTrustedAnchors = new X509Certificate[0];
                 //           return myTrustedAnchors;
                   //     }
//@Override
  //                  public void checkClientTrusted(X509Certificate[] certs, String authType) {
    //                    }
//
  //                      @Override
    //                    public void checkServerTrusted(X509Certificate[] certs, String authType) {
      //                  }
        //            }
           // };


            URL aurl = new URL(urltext);

            aconnection = (HttpsURLConnection) aurl.openConnection();

            aconnection.setHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String arg0, SSLSession arg1) {
                    return true;
                }
            });

            aconnection.setRequestMethod("GET");

            aconnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.29 Safari/537.36");

            aconnection.setDoInput(true);


            InputStream astream = aconnection.getInputStream();

            BufferedReader areader = new BufferedReader(new InputStreamReader(astream));

            StringBuilder aresponse = new StringBuilder();

            String aline = null;

            while ((aline = areader.readLine()) != null) {
                //I see the entire response in 'aline' variable. But the while gets executed only
               // once..I wonder why ?
                        aresponse.append(aline);
                aresponse.append("/r");
            }

            areader.close();
            String aresult = aresponse.toString();
            System.out.println(aresult);


            JSONObject aobject = new JSONObject(aresult);

            String ratings = aobject.getString("imDb");
        } catch (MalformedURLException e) {
            System.out.println("Malformed exception");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}