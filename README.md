# E-Restaurant-Billing-System

##It is mainly a Java Swing app based on paperless billing system combined with apps like Zomato,Swiggy for a restaurant.
------------------------------------------------------------------------------------------------------------------------

##It will give you basic inforamtion regarding the project.

Step 1:To create a paricular layout<br>
         <ul>
        <li> Create a JFrame folder in which create several <strong><em>Jframe files</strong></em> according to your need.<br></li>
        <li>Select any file and then click on design to make layout<br></li>
        <li>From the <strong><em>pallete window</strong></em> insert the field required in your layout.<br></li>
         </ul>
     
Step 2:For Registration<br>
        <ul>
        <li>Password validation has been done.<br></li>
        <li>Values entered are stored in register table in mysql.<br></li>
        <li>If user has already been registered then can login from the button show below for login and then login file is opened<br></li>
        </ul>
         
Step 3:Login<br>
         <ul>
        <li>Username and password entered is compared with the data in register table in mysql.<br></li>
        <li>It is matches then the menu file is appears,if it deoesn't match then user are redirected to register page.<br></li>
        <li>If user has forgotten password then it can be reseted by clicking on forgot,it will open forgot file.<br></li>
        <li>In forgot if the number matches with the registered no. then and only then user can change password.<br></li>
        <li>The register table is also updated when user chnages password.<br></li>
        <li>After changing password user can relogin with new password.<br></li>
         </ul>

Step 4:Menu<br>
        <ul>
        <li>The menu card is created using <strong><em>scroll panel</strong></em> available in pallete.<br></li>
        <li>With the help of <strong><em>setText()</strong></em> the name,mobile no field directly contains name and mobile no in menu.<br></li>
        <li>Through <strong><em>random keyword</strong></em> bill no. is generated.<br></li>
        <li>Total of the items is dispayed as well as its bill is shown<br></li>
        <li>If user wants to pay by card then there is also an option for it,opens payment file<br></li>
        <li>While exiting the program ,data like name,mobile no. and total will be saved in the table.<br></li>
        </ul>
        
Step 5:Payment<br>
         <ul>
        <li>If the data entered for payment is correct then user are directed to exit page if not then payment is refreshed.<br></li>
         </ul>
         
Step 6:Link files(register,login,forgot,new_password,menu) with database<br>
        <ul>
        <li>The data entered(username,mobile no,password ,confirm password etc.) is linked with the mysql database.<br></li>
        <li><strong><em>Password of mysql should in entered in "enter your db password"</strong></em><br></li>
        <li>local host is mostly 3306 if its different then change in local host<br> </li>
         </ul>
        The database is linked in two ways here: 
            
            >>-a)Through class.forName (Used in login,register,forgot)(It is used for lower version of database)
                  -It may give data truncation error
            >>-b)JDBC Url(Used in new_password,menu)
                  -In order to make program linked errorlessly ,it should be used.
                  
      
