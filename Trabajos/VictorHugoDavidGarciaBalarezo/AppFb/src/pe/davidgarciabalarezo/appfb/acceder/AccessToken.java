/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.davidgarciabalarezo.appfb.acceder;

/**
 *
 * @author David Garcia Balarezo
 */
public class AccessToken {
    //Datos, pasando el accessToken que es el codigo obtenido desde fb
    public  String accessToken;
    private  String appId;
    private  String appSecret;
    

    public AccessToken() {
    }    
  
    public void setAccessToken(String Token){
        this.accessToken=Token;        
    }
    
    public String getAccessToken(){
        return accessToken;
    }

    /**
     * @return the appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @param appId the appId to set
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * @return the appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * @param appSecret the appSecret to set
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    
}
