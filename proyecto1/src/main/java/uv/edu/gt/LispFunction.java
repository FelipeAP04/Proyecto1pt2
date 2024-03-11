package uv.edu.gt;

public class LispFunction {

    private String name;
    private List<String> parameters;
    private LispExpression body;



    public LispExpression apply(List<LispExpression> arguments, Environment env){

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name){
        this.name = name;
    }

    public List<String> getParameters(){
        return parameters;
    }

    public void setParameters(List<String> parameters){
        this.parameters = parameters;
    }

    public LispExpression getBody() {
        return body;
    }

    public void setBody(LispExpression body){
        this.body = body;
    }
}
