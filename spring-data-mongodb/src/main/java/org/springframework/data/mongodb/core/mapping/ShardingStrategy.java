/*
 * Copyright 2020-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.mongodb.core.mapping;

/**
 * @author Christoph Strobl
 * @since 3.0
 */
public enum ShardingStrategy {

	/**
	 * Ranged sharding involves dividing data into ranges based on the shard key values. Each chunk is then assigned a
	 * range based on the shard key values.
	 */
	RANGE,

	/**
	 * Hashed Sharding involves computing a hash of the shard key field’s value. Each chunk is then assigned a range based
	 * on the hashed shard key values.
	 */
	HASH
}
