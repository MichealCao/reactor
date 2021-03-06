/*
 * Copyright (c) 2011-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.core.dynamic.annotation;

import java.lang.annotation.*;

/**
 * Annotation to denote that a method should proxy a call to an underlying {@link reactor.core.Reactor#on(reactor.fn.Selector, reactor.fn.Consumer))}.
 *
 * @author Jon Brisbin
 * @author Andy Wilkinson
 */
@Target({
						ElementType.METHOD
				})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface On {

	/**
	 * The string to use as a {@link reactor.fn.Selector}.
	 *
	 * @return
	 */
	String value() default "";

}
