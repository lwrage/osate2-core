package org.osate.ge.fx.nodes;

import java.util.Objects;

import org.osate.ge.fx.styling.HasBackgroundColor;
import org.osate.ge.fx.styling.HasLineWidth;
import org.osate.ge.fx.styling.HasOutlineColor;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

// TODO: Rename?
public class PolygonNode extends Region implements HasBackgroundColor, HasOutlineColor, HasLineWidth {
	private final javafx.scene.shape.Polygon poly = new Polygon();
	private double[] points; // TOOD: Document meaning/range

	public PolygonNode(final double... points) {
		this.points = Objects.requireNonNull(points, "points must not be null").clone();
		this.getChildren().addAll(poly);

		// TODO: Require multiple of 2
		// TODO: Set points?

		setLineWidth(2);
		setBackgroundColor(Color.WHITE);
		setOutlineColor(Color.BLACK);
	}
	@Override
	public boolean isResizable() {
		return true;
	}

	@Override
	public void resize(double width, double height) {
		super.resize(width, height);

		// Transform the points based on the specified size
		Double[] sizedPoints = new Double[points.length];
		for (int i = 0; i < sizedPoints.length; i += 2) {
			sizedPoints[i] = points[i] * width;
			sizedPoints[i + 1] = points[i + 1] * height;
		}

		poly.getPoints().setAll(sizedPoints);
	}

	@Override
	public final void setBackgroundColor(final Color value) {
		poly.setFill(value);
	}

	@Override
	public final void setOutlineColor(final Color value) {
		poly.setStroke(value);
	}

	@Override
	public final void setLineWidth(final double value) {
		poly.setStrokeWidth(value);
	}

	public static void main(final String[] args) {
		NodeApplication.run(new PolygonNode(0.5, 0.0, 0.0, 1.0, 1.0, 1.0));
	}
}
