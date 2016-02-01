package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * @author dens on 31.01.16.
 */
@ManagedBean
@SessionScoped
public class CitationsBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String citation;

    public String getCitation() {
        return citation;
    }
    public void setCitation(String citation) {
        this.citation = citation;
    }
}
