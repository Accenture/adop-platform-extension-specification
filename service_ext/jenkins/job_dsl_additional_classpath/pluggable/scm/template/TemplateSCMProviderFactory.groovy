
package pluggable.scm.template;

import pluggable.scm.SCMProvider;
import pluggable.scm.SCMProviderFactory;
import pluggable.scm.SCMProviderInfo;

/**
* This is an example SCM factory class responsible for parsing the
* providers properties and instantiating an SCMProvider.
*/
@SCMProviderInfo(type="template")
public class TemplateSCMProviderFactory implements SCMProviderFactory {

  /**
  * A factory method which return an SCM Provider instantiated with the
  * the provided properties.
  *
  * @param scmProviderProperties - properties for the SCM provider.
  * @return SCMProvider configured from the provided SCM properties.
  **/
  public SCMProvider create(Properties scmProviderProperties){

    TemplateSCMProvider scmProvider = null;

    String sampleProperty = scmProviderProperties.getProperty("sample.property");

    scmProvider = new TemplateSCMProvider(sampleProperty);

    return scmProvider;
  }
}