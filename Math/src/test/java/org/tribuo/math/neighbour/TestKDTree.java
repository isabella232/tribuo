/*
 * Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tribuo.math.neighbour;

import com.oracle.labs.mlrg.olcut.config.PropertyException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.tribuo.math.distance.DistanceType;
import org.tribuo.math.neighbour.kdtree.KDTree;
import org.tribuo.math.neighbour.kdtree.KDTreeFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for the k-d tree nearest neighbour query implementation. See {@link NeighbourQueryTestHelper} for the
 * details of the tests.
 */
public class TestKDTree {
    
    @BeforeAll
    public static void setup() {
        Logger logger = Logger.getLogger(KDTree.class.getName());
        logger.setLevel(Level.WARNING);
    }

    @Test
    public void testSingleThreadQueryAll() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 1);
        NeighbourQueryTestHelper.neighboursQueryAll(factory);
    }

    @Test
    public void testMultiThreadQueryAll() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 4);
        NeighbourQueryTestHelper.neighboursQueryAll(factory);
    }


    @Test
    public void testSingleThreadQueryMany() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 1);
        NeighbourQueryTestHelper.neighboursQueryMany(factory);
    }

    @Test
    public void testMultiThreadQueryMany() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 2);
        NeighbourQueryTestHelper.neighboursQueryMany(factory);
    }

    @Test
    public void testNeighboursQueryOneInclusive() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 1);
        NeighbourQueryTestHelper.neighboursQueryOneInclusive(factory);
    }

    @Test
    public void testNeighboursQueryOneExclusive() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 1);
        NeighbourQueryTestHelper.neighboursQueryOneExclusive(factory);
    }

    @Test
    public void testSingleDimension() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 1);
        NeighbourQueryTestHelper.neighboursQuerySingleDimension(factory);
    }

    @Test
    public void testMultiThreadQueryMany3D() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 2);
        NeighbourQueryTestHelper.neighboursQueryMany3D(factory);
    }

    @Test
    public void testMultiThreadQueryAllIntegers4D() {
        KDTreeFactory factory = new KDTreeFactory(DistanceType.L2, 4);
        NeighbourQueryTestHelper.neighboursQueryAllIntegers4D(factory);
    }

    @Test void testInvalidKDTreeFactory() {
        assertThrows(PropertyException.class, () -> new KDTreeFactory(DistanceType.L2, 0) );
    }
}
