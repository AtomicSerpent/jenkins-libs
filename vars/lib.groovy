
@Grab('org.codehaus.groovy.groovy-all.3.0.8.repo.org.codehaus.groovy:groovy-yaml:3.0.8')
import groovy.yaml.YamlBuilder
@NonCPS
def test(filepath) {
println(filepath)
def yamlBuilder = new YamlBuilder()
yamlBuilder{
    car{
        name 'Volvo'
        make 'Kyiv'
        other{
            param1 'param1'
            param2 'param2'
        }
    }
}

    File filename1 = new File (filepath.toString()+"/out1.yaml")
filename1.createNewFile(yamlBuilder.toString())
//println(filename1)

}
