package hacker;

import java.io.*;
import java.util.*;

public class Main {

    static Map<String, Integer> apiVersion = new HashMap<>();
    static Map<String, Integer> mobApp = new HashMap<>();

    public static void main(String[] args) {

        FileInputStream fis = null;
        BufferedReader reader = null;
        String[] inputField = new String[3];
        List<MobileApp> appList = new ArrayList<>();


        try {
            fis = new FileInputStream("C:/input/sample.txt");
            reader = new BufferedReader(new InputStreamReader(fis));

            String line = reader.readLine();
            while (line != null) {
                inputField = line.split(",");
                MobileApp mApp = new MobileApp();
                mApp.setMobApp(inputField[0]);
                mApp.setApiName(inputField[1]);
                mApp.setVersion(Integer.parseInt(inputField[2].trim().replace("v", "")));

                line = reader.readLine();
                appList.add(mApp);
            }

            fillapiVersion(appList);

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {


        } finally {
            try {
                reader.close();
                fis.close();
            } catch (IOException ex) {

            }

        }


        for (MobileApp app : appList) {
            int appVer = app.getVersion();

            if (appVer >= apiVersion.get(app.getApiName())) {

                if (mobApp.containsKey(app.getMobApp())) {
                    mobApp.put(app.getMobApp(), mobApp.get(app.getMobApp()) + 1);
                } else {
                    mobApp.put(app.getMobApp(), 1);
                }
            }
        }

        System.out.println(mobApp);

        Map.Entry<String, Integer> maxEntry = Collections.max(mobApp.entrySet(), (e1, e2) -> e1.getValue() > e2.getValue() ? 1 : -1);

        System.out.println(maxEntry.getKey());

        try {
            FileWriter fwriter = new FileWriter(System.getProperty("user.dir") + "output.txt");
            fwriter.write(maxEntry.getKey());
            fwriter.close();
        } catch (IOException e) {

        }

    }

    static private void fillapiVersion(List<MobileApp> appList) {
        for (MobileApp app : appList) {
            apiVersion.put(app.getApiName(), app.getVersion());
        }
    }

}

class MobileApp {
    String mobApp;
    String apiName;
    int version;

    public String getMobApp() {
        return mobApp;
    }

    public void setMobApp(String mobApp) {
        this.mobApp = mobApp;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}