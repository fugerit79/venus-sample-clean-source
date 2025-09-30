package org.fugerit.java.demo.venussamplecleansource;

import org.fugerit.java.doc.freemarker.process.FreemarkerDocProcessConfig;
import org.fugerit.java.doc.freemarker.process.FreemarkerDocProcessConfigFacade;

/**
 * DocHelper, version : auto generated on 2025-09-30 21:49:18.742
 */
public class DocHelper {

     /*
      * FreemarkerDocProcessConfig is thread-safe and should be initialized once for each config file.
      * 
      * Consider using a @ApplicationScoped or Singleton approach.
      */
     private FreemarkerDocProcessConfig docProcessConfig = FreemarkerDocProcessConfigFacade.loadConfigSafe( "cl://venus-sample-clean-source/fm-doc-process-config.xml" );

     /**
      * Accessor for FreemarkerDocProcessConfig configuration.
      *
      * @return the FreemarkerDocProcessConfig instance associated with this helper.
      */
     public FreemarkerDocProcessConfig getDocProcessConfig() { return this.docProcessConfig; }

}
