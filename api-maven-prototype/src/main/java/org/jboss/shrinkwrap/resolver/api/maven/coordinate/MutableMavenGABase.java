/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.resolver.api.maven.coordinate;

import org.jboss.shrinkwrap.resolver.api.maven.dependency.exclusion.DependencyExclusionBuilder;

/**
 * Defines base operations for the mutable view of a single Maven groupId and artifactId, used in construction of more
 * full-featured Maven coordinate types such as {@link MutableMavenCoordinate} and {@link DependencyExclusionBuilder}
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MutableMavenGABase<COORDINATETYPE extends MutableMavenGABase<COORDINATETYPE>> extends MavenGABase {

    /**
     * Sets the specified groupId, returning this coordinate
     *
     * @param groupId
     * @return
     * @throws IllegalArgumentException
     *             If the groupId is not specified
     */
    COORDINATETYPE groupId(String groupId) throws IllegalArgumentException;

    /**
     * Sets the specified artifactId, returning this coordinate
     *
     * @param artifactId
     * @return
     * @throws IllegalArgumentException
     *             If the artifactId is not specified
     */
    COORDINATETYPE artifactId(String artifactId) throws IllegalArgumentException;
}