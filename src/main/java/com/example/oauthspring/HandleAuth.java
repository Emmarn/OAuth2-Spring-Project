package com.example.oauthspring;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class HandleAuth  extends SimpleUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

        public HandleAuth(){
            super();
            setUseReferer(false);

    }

}
