/**
 * 
 */
package com.selfserve.orderapi.cart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.selfserve.orderapi.cart.entity.Cart;

/**
 * @author m_209474
 *
 */
public interface CartRepository extends MongoRepository<Cart, String>{

	Cart findBySessionId(String sessionId);
	Cart findByProfileId(String profileId);
}
