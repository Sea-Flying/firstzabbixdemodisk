package com.seaflying.zabbix.FisrtZabbixDemoDisk;

        import io.github.hengyunabc.zabbix.api.DefaultZabbixApi;
        import java.io.*;
        import java.util.Properties;

public class c1 {
    Properties props = new Properties();
    InputStream in = new BufferedInputStream(new FileInputStream("config.properties"));
    props.load(in);
    String url = props.getProperty("ZabbixServerUrl");
    String user = props.getProperty("User");
    String passwd = props.getProperty("Passwd");

    DefaultZabbixApi zabbixApi = new DefaultZabbixApi(url);
    zabbixApi.init();

    boolean login = zabbixApi.login(user, passwd);
    System.err.println("login status: "+login);



}
