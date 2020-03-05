package com.luxiti.fxtestemv.repository;

import com.luxiti.fxtestemv.domain.Authority;

/**
 * Spring Data Couchbase repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends ReactiveN1qlCouchbaseRepository<Authority, String> {
}
