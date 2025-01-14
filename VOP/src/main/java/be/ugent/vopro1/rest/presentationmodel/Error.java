package be.ugent.vopro1.rest.presentationmodel;

/**
 * Class representing an error. Acts as a Presentation Model for a specific
 * error towards the user.
 */
public class Error {

    private final int code;
    private final String fields;
    private final String message;

    /**
     * Construct an Error to be presented to the user, without the input fields
     * that resulted in this error.
     * <p>
     * This method calls the extended constructor
     * {@link #Error(int, java.lang.String, java.lang.String)} with an empty
     * fields parameter.
     *
     * @param code http status-code generated by this error.
     * @param message description of the error.
     * @see #Error(int, java.lang.String, java.lang.String)
     */
    public Error(int code, String message) {
        this(code, "", message);
    }

    /**
     * Construct an Error to be presented to the user.
     *
     * @param code http status-code generated by this error.
     * @param fields information about the input fields resulting in this error.
     * @param message description of the error.
     */
    public Error(int code, String fields, String message) {
        this.code = code;
        this.fields = fields;
        this.message = message;
    }

    /**
     * Returns the http status-code generated by this error.
     *
     * @return code the http status-code generated by this error.
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns the input fields that resulted in this error.
     *
     * @return fields information about the input fields resulting in this
     * error.
     */
    public String getFields() {
        return fields;
    }

    /**
     * Returns the description of this error.
     *
     * @return description of this error.
     */
    public String getMessage() {
        return message;
    }

}
