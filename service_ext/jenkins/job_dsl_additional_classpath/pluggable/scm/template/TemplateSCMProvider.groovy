
package pluggable.scm.template;

import pluggable.scm.SCMProvider;

import pluggable.configuration.EnvVarProperty;
import pluggable.scm.helpers.ExecuteShellCommand;
import pluggable.scm.helpers.Logger;

/**
* This class implements your chosen SCM Provider.
*/
public class TemplateSCMProvider implements SCMProvider {

  private final def sampleProperty = null;

  /**
  * Constructor for class a sample SCMProvider.
  * @param sampleProperty An example property to be used in your constructor
  */
  public TemplateSCMProvider(def sampleProperty){

      this.sampleProperty = sampleProperty;

  }


  /**
  * Creates relevant repositories defined by your cartridge in your chosen SCM provider
  * @param workspace Workspace of the cartridge loader job
  * @param repoNamespace Location in your SCM provider where your repositories will be created
  * @param overwriteRepos Whether the contents of your created repositories are over-written or not
  **/
  public void createScmRepos(String workspace, String repoNamespace, String codeReviewEnabled, String overwriteRepos) {
		
	// Calling a helper class to allow execution of shell commands on your Jenkins instance
	ExecuteShellCommand com = new ExecuteShellCommand()

	// Defaults
	String cartHome = "/cartridge"
	String urlsFile = workspace + cartHome + "/src/urls.txt"
    
	// Class to provide access to all Jenkins environment variables
	EnvVarProperty envVarProperty = EnvVarProperty.getInstance();

	// Check if code review has been enabled
	if(codeReviewEnabled.equals("true") && this.scmCodeReviewEnabled.equals("false")){
	  throw new IllegalArgumentException("You have tried to use code review however it is not supported for your chosen SCM provider.");
	}

	// Create repositories
	String command1 = "cat " + urlsFile
	List<String> repoList = new ArrayList<String>();
	repoList = (com.executeCommand(command1).split("\\r?\\n"));

	for(String repo: repoList) {
		// Defaults
		String repoName = repo.substring(repo.lastIndexOf("/") + 1, repo.indexOf(".git"));
		String target_repo_name= repoNamespace + "/" + repoName
		int repo_exists=0;

		// Check if the repository already exists or not
		// If not, create it
		// Populate repository

		Logger.info("This is how you to log to the Jenkins system console");  	

	}
  }

  /**
    Return SCM section.

    @param projectName - name of the project.
    @param repoName  - name of the repository to clone.
    @param branchName - name of branch.
    @param credentialId - name of the credential in the Jenkins credential
            manager to use.
    @param extras - extra closures to add to the SCM section.
    @return a closure representation of the SCM providers SCM section.
  **/
  public Closure get(String projectName, String repoName, String branchName, String credentialId, Closure extras){
    if(extras == null) extras = {}
        return {

        }
    }

    /**
    * Return a closure representation of the SCM providers trigger SCM section.
    * @param projectName - project name.
    * @param repoName - repository name.
    * @param branchName - branch name to trigger.
    * @return a closure representation of the SCM providers trigger SCM section.
    */
    public Closure trigger(String projectName, String repoName, String branchName) {
        return {

        }
    }
}
