/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.davidgarciabalarezo.appfb.acceder;

// Generated by delombok at Fri Mar 04 19:58:22 CET 2016
/**
 * Copyright (c) 2010-2016 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */


import com.restfb.Facebook;

/**
* Represents the <a href="https://developers.facebook.com/docs/test_users">Test User type</a>.
 *
 * @author <a href="http://ex-nerd.com">Chris Petersen</a>
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.6.10
 */
public class TestUser extends FacebookType {

  
  /**
   * You can use this access token to make API calls on behalf of the test user. This is available only if your app has
   * been installed by the test user.
   */
  @Facebook("access_token")
  private String accessToken;
  
  /**
   * You can login as the test user by going to this url.
   */
  @Facebook("login_url")
  private String loginUrl;
  
  /**
   * If logging in manually (that is, not using the login_url), you can use this as the user's email address.
   */
  @Facebook
  private String email;
  
  /**
   * If logging in manually (that is, not using the login_url), you can use this as the user's password.
   */
  @Facebook
  private String password;
  private static final long serialVersionUID = 1L;

  /**
   * You can use this access token to make API calls on behalf of the test user. This is available only if your app has
   * been installed by the test user.
   *
   * @return The test user's access token.
   */
  public String getAccessToken() {
    return this.accessToken;
  }

  /**
   * You can use this access token to make API calls on behalf of the test user. This is available only if your app has
   * been installed by the test user.
   */
  public void setAccessToken(final String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * You can login as the test user by going to this url.
   *
   * @return The test user's login url.
   */
  public String getLoginUrl() {
    return this.loginUrl;
  }

  /**
   * You can login as the test user by going to this url.
   */
  public void setLoginUrl(final String loginUrl) {
    this.loginUrl = loginUrl;
  }

  /**
   * If logging in manually (that is, not using the login_url), you can use this as the user's email address.
   *
   * @return The test user's email address.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * If logging in manually (that is, not using the login_url), you can use this as the user's email address.
   */
  public void setEmail(final String email) {
    this.email = email;
  }

  /**
   * If logging in manually (that is, not using the login_url), you can use this as the user's password.
   *
   * @return The test user's password.
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * If logging in manually (that is, not using the login_url), you can use this as the user's password.
   */
  public void setPassword(final String password) {
    this.password = password;
  }
}













