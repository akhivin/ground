/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.berkeley.ground.lib.factory.core;

import java.util.List;
import java.util.Map;

import edu.berkeley.ground.lib.exception.GroundException;
import edu.berkeley.ground.lib.factory.version.VersionFactory;
import edu.berkeley.ground.lib.model.core.StructureVersion;
import edu.berkeley.ground.lib.model.version.GroundType;

public interface StructureVersionFactory extends VersionFactory<StructureVersion> {

    StructureVersion create(long structureId, Map<String, GroundType> attributes, List<Long> parentIds)
	    throws GroundException;

    @Override
    default Class<StructureVersion> getType() {
	return StructureVersion.class;
    }

    @Override
    StructureVersion retrieveFromDatabase(long id) throws GroundException;
}
