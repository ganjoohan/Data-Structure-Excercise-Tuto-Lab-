/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q5;

/**
 *
 * @author User
 */
public class ListNodeQ5 <T>{
    private T data;
    private ListNodeQ5 link;
    
    public ListNodeQ5(){
        data = null;
        link = null;
    }

    public ListNodeQ5(T data, ListNodeQ5 link) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public ListNodeQ5 getLink() {
        return link;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNodeQ5 setLink(ListNodeQ5 link) {
        this.link = link;
        return link;
    }
    
    public String toString(){
        return data +"";
    }
    
}
