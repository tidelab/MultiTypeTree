/*
 * Copyright (C) 2012 Tim Vaughan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package beast.evolution.operator;

import beast.core.Description;

/**
 * Wilson-Balding branch swapping operator applied to coloured trees,
 * modified so that only those moves which preserve the validity of
 * the colouring are proposed.
 *
 * @author Tim Vaughan
 */
@Description("Implements the unweighted Wilson-Balding branch"
		+ "swapping move.  This move is similar to one proposed by WILSON"
		+ "and BALDING 1998 and involves removing a subtree and"
		+ "re-attaching it on a new parent branch. " +
        "See <a href='http://www.genetics.org/cgi/content/full/161/3/1307/F1'>picture</a>."
		+ "This version is altered to perform only those moves which preserve"
		+ "the validity of the tree colouring.")
public class ColouredWilsonBalding extends ColouredTreeOperator {

	@Override
	public void initAndValidate() { }

	@Override
	public double proposal() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}