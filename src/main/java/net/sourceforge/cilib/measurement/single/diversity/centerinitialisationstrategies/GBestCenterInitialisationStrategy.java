/*
 * GBestCenterIhnitialisationStrategy.java
 * 
 * Copyright (C) 2003, 2004 - CIRG@UP 
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science 
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.cilib.measurement.single.diversity.centerinitialisationstrategies;

import net.sourceforge.cilib.algorithm.Algorithm;
import net.sourceforge.cilib.algorithm.population.PopulationBasedAlgorithm;
import net.sourceforge.cilib.pso.PSO;
import net.sourceforge.cilib.type.types.container.Vector;

public class GBestCenterInitialisationStrategy extends CenterInitialisationStrategy {
	
	/**
	 * TODO: This is not really nice. Look at making this better. It needs to be more generic
	 */
	@Override
	public Vector getCenter() {
		PopulationBasedAlgorithm algorithm = (PopulationBasedAlgorithm) Algorithm.get();
		
		if(algorithm instanceof PSO)
			return (Vector) (((PSO) algorithm).getBestParticle().getPosition());
		else
			return (Vector) algorithm.getBestSolution().getPosition();
	}
}