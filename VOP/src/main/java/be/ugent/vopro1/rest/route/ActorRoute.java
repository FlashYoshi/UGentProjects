package be.ugent.vopro1.rest.route;

import be.ugent.vopro1.util.LocalConstants;

/**
 * Stores routes for the /actor endpoint of the API.
 * <p>
 * These routes are used by the
 * {@link be.ugent.vopro1.rest.controller.ActorRestController} to map the
 * incoming requests to the right controller method.
 *
 * @see be.ugent.vopro1.rest.controller.ActorRestController
 */
public class ActorRoute {

    private static final String ENDPOINT = "/actor";
    private static final String IDENTIFIER = "/{actorName}";
    public static final String GET_ALL = ENDPOINT;
    public static final String PATCH = LocalConstants.URL + IDENTIFIER;
    public static final String DELETE = LocalConstants.URL + IDENTIFIER;
    public static final String SELF = LocalConstants.URL + IDENTIFIER;
}