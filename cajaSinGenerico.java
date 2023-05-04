public class CajaSinGenericos {
    Object[] content;
    
    public CajaSinGenericos() {
    }
    
    public CajaSinGenericos(Object[] content) {
        this.content = content;
    }
    public String toString(){
        return "CajaSinGenericos{" +
        "content=" + Arrays.toString(content) +
        '}';
    }
    
    public void add (int pos, T objeto){
        content[pos] = objeto;
    }
    public T get(int pos){
        return content[pos];
    }
    
}
