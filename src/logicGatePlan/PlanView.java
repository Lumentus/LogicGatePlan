package logicGatePlan;

import java.awt.Point;

/**
 * Generates what the user sees
 * @author Lumentus
 *
 */
public class PlanView {
	private Plan plan;
	private Point position;
	private int zoom;
	private int viewWidth;
	private int viewHeight;
	/**
	 * Creates a view just from the width and height of the canvas as well as a zoom factor
	 * @param viewWidth The width of the canvas
	 * @param viewHeight The height of the canvas
	 * @param zoom The zoom factor
	 */
	public PlanView(int viewWidth, int viewHeight, int zoom)
	{
		this(viewWidth, viewHeight, zoom, new Plan(viewWidth, viewHeight));
	}
	/**
	 * Creates a view from the width and height of the canvas as well as a zoom factor
	 * it also takes the plan displayed
	 * @param viewWidth The width of the canvas
	 * @param viewHeight The height of the canvas
	 * @param zoom The zoom factor
	 * @param plan The plan, that is displayed
	 */
	public PlanView(int viewWidth, int viewHeight, int zoom, Plan plan)
	{
		this(viewWidth, viewHeight, zoom, plan, new Point((int)Math.ceil(viewWidth/2.0), (int)Math.ceil(viewHeight/2.0)));
	}
	/**
	 * Creates a view from the width and height of the canvas as well as a zoom factor
	 * it also takes the plan displayed
	 * @param viewWidth The width of the canvas
	 * @param viewHeight The height of the canvas
	 * @param zoom The zoom factor
	 * @param plan The plan, that is displayed
	 * @param position The position of the center of the view on the plan
	 */
	public PlanView(int viewWidth, int viewHeight, int zoom, Plan plan, Point position)
	{
		this.setViewWidth(viewWidth);
		this.setViewHeight(viewHeight);
		this.setPosition(position);
		this.setZoom(zoom);
		this.setPlan(plan);
	}
	
	
	
	public int getViewHeight() {
		return viewHeight;
	}
	public void setViewHeight(int viewHeight2) {
		this.viewHeight = viewHeight2;
	}
	public int getViewWidth() {
		return viewWidth;
	}
	public void setViewWidth(int viewWidth2) {
		this.viewWidth = viewWidth2;
	}
	public int getZoom() {
		return zoom;
	}
	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		int x, y;
		// Make sure the position is a legal position(not to far to the sides so view space is given away)
		if(position.x < this.viewWidth/2)
		{
			x = (int)Math.ceil(this.viewWidth/2.0);
		}
		else if(position.x > (this.plan.getWidth() - (int)Math.ceil(this.viewWidth/2.0)))
		{
			x = this.plan.getWidth() - (int)Math.ceil(this.viewWidth/2.0);
		}
		else
		{
			x = position.x;
		}
		if(position.y < this.viewHeight/2)
		{
			y = (int)Math.ceil(this.viewHeight/2.0);
		}
		else if(position.y > (this.plan.getHeight() - (int)Math.ceil(this.viewHeight/2.0)))
		{
			y = this.plan.getHeight() - (int)Math.ceil(this.viewHeight/2.0);
		}
		else
		{
			y = position.y;
		}
		this.position = new Point(x, y);
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
}
