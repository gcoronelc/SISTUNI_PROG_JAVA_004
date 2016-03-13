/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.davidgarciabalarezo.service;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.DefaultLegacyFacebookClient;
import com.restfb.Facebook;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.LegacyFacebookClient;
import com.restfb.Parameter;
 
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;
 
import static java.lang.System.out;
import static java.util.Collections.singletonList;
import java.util.List;
import pe.davidgarciabalarezo.appfb.acceder.Acceder;
import pe.davidgarciabalarezo.appfb.acceder.InfoFacebook;
import static java.lang.String.format;

/**
 *
 * @author DavidGarciaBalarezo (fb)
 */
public class LoggingService extends Acceder {
    private LegacyFacebookClient facebookCliente;    
    
     
  public void ejecutarTodo(String at,String ai,String as) {
    facebookCliente = new DefaultLegacyFacebookClient(at);      
    object(at,ai,as);
   // list();
    //fql();
    publish();
  }

  void object(String at,String ai,String as) {
      System.out.println("------");
  }

  void list() {
    out.println("* Call that returns a list *");

    List<LegacyUser> users = facebookCliente.executeForList("Users.getInfo", LegacyUser.class,
      Parameter.with("uids", "220439, 7901103"), Parameter.with("fields", "last_name, first_name"));

    out.println("Users: " + users);
  }

   




  /**
   * Holds user information as retrieved in {@link #list()}.
   */
  public static class LegacyUser {
    @Facebook("first_name")
    String firstName;

    @Facebook("last_name")
    String lastName;

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
      return format("%s %s", firstName, lastName);
    }
  }

  void fql() {
    Long uid = facebookCliente.execute("users.getLoggedInUser", Long.class);

    // FQL query which asks Facebook for your friends' names, profile picture
    // URLs, and network affiliations
    String query = "SELECT name, pic_big, affiliations FROM user " + "WHERE uid IN (SELECT uid2 FROM friend WHERE uid1="
        + uid + ")";

    // Executes an API call with result mapped to a list of classes we've
    // defined. Note that you can pass in an arbitrary number of Parameters -
    // here we send along the query as well as the "give me HTTPS URLs" flag
    List<LegacyFqlUser> users = facebookCliente.executeForList("fql.query", LegacyFqlUser.class,
      Parameter.with("query", query), Parameter.with("return_ssl_resources", "true"));

    System.out.println("My friends and their affiliations:");

    for (LegacyFqlUser user : users)
      System.out.println(user);
  }

  /**
   * Holds user information as retrieved in {@link #list()}.
   */
  public static class LegacyFqlUser {
    // By default, assumes JSON attribute name is the same as the Java field
    // name
    @Facebook
    String name;

    // If your Java field name is different than the JSON attribute name, just
    // specify the JSON attribute name
    @Facebook("pic_big")
    String pictureUrl;

    @Facebook
    List<Affiliation> affiliations;

    @Override
    public String toString() {
      return format("Name: %s\nProfile Image URL: %s\nAffiliations: %s", name, pictureUrl, affiliations);
    }
  }

  public static class Affiliation {
    @Facebook
    String name;

    @Facebook
    String type;

    @Override
    public String toString() {
      return format("%s (%s)", name, type);
    }
  }

  void publish() {
    out.println("* Publicando..desde java *");

    ActionLink category = new ActionLink();
    category.href = "http://gcoronelc.github.io/CEPSUNI_JDBC_002/";
    category.text = "humor";

    Properties properties = new Properties();
    properties.category = category;
    properties.ratings = "5 stars";
     

    Medium medium = new Medium();
    medium.href = "http://gcoronelc.github.io/CEPSUNI_JDBC_002/";
    medium.src = "http://ffgrouppakistan.com/wp-content/uploads/2015/12/netbeans-logo.png";
    medium.type = "image";

    Attachment attachment = new Attachment();
    attachment.name = "1Mi primer post desde java-Publicidad";
    attachment.href = "http://gcoronelc.github.io/CEPSUNI_JDBC_002/";
    attachment.caption = "{*actor*} rated the lolcat 5 stars";
    attachment.description = "Curso Java con Coronel";
    attachment.properties = properties;
    attachment.media = singletonList(medium);

    // Send the request to Facebook.
    // We specify the fact that we're expecting a String response and that we're
    // passing along an attachment (defined above).

    String postId = facebookCliente.execute("stream.publish", String.class, Parameter.with("attachment", attachment));

    out.println("Id del nuevo post: " + postId);
  }

 

  public static class ActionLink {
    @Facebook
    String text;

    @Facebook
    String href;
  }

  public static class Medium {
    @Facebook
    String type;

    @Facebook
    String src;

    @Facebook
    String href;
  }

  public static class Properties {
    @Facebook
    ActionLink category;

    @Facebook
    String ratings;
  }

  public static class Attachment {
    @Facebook
    String name;

    @Facebook
    String href;

    @Facebook
    String caption;

    @Facebook
    String description;

    @Facebook
    Properties properties;

    @Facebook
    List<Medium> media;
  }
}
