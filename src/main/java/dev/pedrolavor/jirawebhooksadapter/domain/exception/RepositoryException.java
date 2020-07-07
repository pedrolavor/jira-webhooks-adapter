package dev.pedrolavor.jirawebhooksadapter.domain.exception;

public class RepositoryException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public RepositoryException(String msg) {
        super(msg);
    }

    public RepositoryException(String msg, Throwable t) {
        super(msg, t);
    }
    
}