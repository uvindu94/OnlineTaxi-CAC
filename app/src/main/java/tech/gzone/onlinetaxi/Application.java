package tech.gzone.onlinetaxi;

import android.os.AsyncTask;

/**
 * Created by Sujeeharan on 29-Jan-16.
 */
public class Application extends AsyncTask {

        String uplatitude,uplongitude,upvehicleno ;
        Application(String puplatitude,String puplongitude,String pupvehicleno){
            uplatitude=puplatitude;
            uplongitude=puplongitude;
            upvehicleno=pupvehicleno;
        }

        Database c=new Database();

        @Override
        protected Object doInBackground(Object[] params) {
            c.insert(uplatitude,uplongitude,upvehicleno);
            return null;
        }


}
