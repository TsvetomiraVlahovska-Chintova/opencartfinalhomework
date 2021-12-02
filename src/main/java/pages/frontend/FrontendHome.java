package pages.frontend;

import utils.Browser;

public class FrontendHome {


        /**
         * Invoking this method will navigate you to the home page in the frontend
         */
        public static void navigate(){
            Browser.driver.get("http://shop.pragmatic.bg/index.php?route=common/home");
        }


}
