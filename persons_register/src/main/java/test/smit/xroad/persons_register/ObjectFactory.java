
package test.smit.xroad.persons_register;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test.smit.xroad.persons_register package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test.smit.xroad.persons_register
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonList }
     * 
     */
    public PersonList createPersonList() {
        return new PersonList();
    }

    /**
     * Create an instance of {@link PersonListResponse }
     * 
     */
    public PersonListResponse createPersonListResponse() {
        return new PersonListResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

}
