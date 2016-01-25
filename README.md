# fluentsquare

##### *What is the target of this setup*
* hotcode replacement within java classes to directly see the changes
* watch task for recompilation of sass files to directly see the changes
* Apache Maven / Apache Wicket / NodeJS / NPM / Grunt / Embedded Jetty environment playing together

##### *Pre-Requirements*
* Ruby / Sass installation (https://www.ruby-lang.org/en/downloads/ - http://rubyinstaller.org/downloads/)
* Mac / Linux: "sudo gem install -n /usr/local/bin sass" or Windows: "gem install sass"

##### *showcase of project setup "Apache Maven / Apache Wicket / NodeJS / NPM / Grunt / Embedded Jetty" - 3 simple things to do*
* *mvn clean package* runs the following commands 
  * installs nodejs / npm
  * npm install
  * copies filtered resources (Gruntfile.js, package.json)
  * grunt build
  * compiles classes
  * builds final war file
* *Run the Runner class (in src/test/java/...) in debug mode*
  * starts the server
* *mvn validate -Pwatch*
  * runs grund build with watch task

##### *background information*
* Switched from embedded tomcat to embedded jetty, because I got no answer regarding hot code replacement

See here: https://mail-archives.apache.org/mod_mbox/tomcat-users/201512.mbox/%3CCAB+Y2gJc+Q5THq6a2AXpVO5xYVZ85xQVkPBB1B_KdxSfZnPRqg@mail.gmail.com%3E

##### *Eclipse*
* You may have to replace the PATH in the run configuration to ensure the maven process working correctly - Example for MAC OS X: "Right click on project" > Run as > Maven build... > "Environment" tab > "Select..." button > select "PATH" > Edit > "/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin" > "Replace native environment with specified environment" - otherwise you may receive a warning that ruby / sass is not installed

See here: http://superuser.com/questions/28344/path-env-variable-on-mac-os-x-and-or-eclipse