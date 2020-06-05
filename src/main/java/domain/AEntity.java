package domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

public abstract class AEntity {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return this.id;
    }
}

