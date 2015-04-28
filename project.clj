(defproject datasplash "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot :all
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [com.google.cloud.dataflow/google-cloud-dataflow-java-sdk-all "0.4.150414"]
                 [com.cognitect/transit-clj "0.8.271"]]
  :profiles {:dev {:dependencies [[org.hamcrest/hamcrest-all "1.3"]
                                  [junit/junit "4.12"]
                                  [me.raynes/fs "1.4.6"]]
                   :aot [datasplash.api-test]}})
