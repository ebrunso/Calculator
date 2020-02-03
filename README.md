# Calculator
Create a calculator app to perform all the standard calculator operations like addition, subtraction, multiplication, divide etc. 
 -No edittexts
 -Changing the orientation to landscape(layout qualifier) will display now functionality (Scientific calculator)
 Hint: Create all buttons using Relative/Grid Layout and append the values to the TextView. Show the result in a separate TextView.

The changed files are:
activity_main.xml, land\activity_main.xml, MainActivity.kt

Compile the project and run it, use the calculator to calculate whatever math equations you would like. Change orientation to landscape to enable additional functionality.

Screenshots below:

![verticalview](https://raw.githubusercontent.com/ebrunso/Calculator/master/verticalviewcalc.png)

![sqrt](https://raw.githubusercontent.com/ebrunso/Calculator/master/sqrt.png)

![log10](https://raw.githubusercontent.com/ebrunso/Calculator/master/log10.png)

![cbrt](https://raw.githubusercontent.com/ebrunso/Calculator/master/cbrt.png)

![abs](https://raw.githubusercontent.com/ebrunso/Calculator/master/absolutevalue.png)

Research
1. Define the following terms: View, ViewGroup, View Hierarchy.
**View: The base class for widgets, that are used to make basic UI elements such as buttons and text fields**

**ViewGroup: Base class for layouts, they are invisible boxes that can hold multiple views. ViewGroups also define view's layout properties.**

**View Hierarchy: When a view is nested in another view, this creates a View Hierarchy, with the parent on the outer view and inner view is the child.**


2. Explain in detail how the following layouts render, a what unique items each has that must be implemented: Constraint, Linear, Coordinator, Grid and Relative?
**Constraint: ConstraintLayout uses a flat view hierarchy to create views. It is best used by utilizing the Layout Editor instead of editing the XML file. In order to define a view's location, the programmer must add a horizontal and vertical constraint to the view, or else the view will appear in the top left corner when the view gets drawn.**

**Linear: LinearLayout uses a tree view hierarchy to display views in horizontal or vertical groups defined in the XML file. "android:orientation" is used to specify if the views are organized in a horizontal column or vertical row. "android:gravity" is used to change a view's vertical or horizontal alignment on its row or column. "android:layout_weight" is used on individual views to determine space between child views.**

**Coordinator: CoordinatorLayout is known as a "super-powered FrameLayout" that is used to define child behaviors using "CoordinatorLayout.DefaultBehavior". Some of the behaviors it can define are animations or views that change its location based on anchors or insetEdges. NOTE: CoordinatorLayout is no longer maintained, and has been superceded by AndroidX**

**Grid: GridLayout uses a grid to set the locations of its child views. Children are set to occupy rows and columns specified by "GridLayout.LayoutParams#rowSpec" and "GridLayout.LayoutParams#columnSpec". Views are not guaranteed to not overlap within their defined rows and columns during runtime, and spaces should be set using "Space" view or by using the following layout parameters: "ViewGroup.MarginLayoutParams#leftMargin", ViewGroup.MarginLayoutParams#topMargin", ViewGroup.MarginLayoutParams#rightMargin, and "ViewGroup.MarginLayoutParams#bottomMargin. Views can also be automatically set with default margins using "GridLayout#setUseDefaultMargins(boolean)". Default margins can be overriden by individually assigned values to the specific view.**

**Relative: RelativeLayout sets child views to be relative to each other or to the parent view. Can be used to replace nested groups and maintain a flat hierarchy.**


3.  What are Listeners?
**Listeners are input events that react to user input on views. Listeners utilize a call-back method to respond to user inputs. A list of some of the user inputs are as follows:
"onClick()", "onLongClick()", "onFocusChange()", "onKey()", "onTouch()", onCreateContextMenu()". Call-back methods can be used to execute additional instructions in the code. Event Listeners can be set to views using Event Handlers using Event Registration.**


4. How does Java garbage collection work?
**The Garbage collector works in two steps. In the first step, Garbage Collector seeks out objects whose references are null and marks those objects for deletion. In the second step, the marked objects are deleted.**


5. Explain the software development lifecycle.
**There are several types of Software Development Lifecycles (SDLC) such as the waterfall model, the spiral model, and the Agile model. The seven stages of the SDLC are: Identification, Planning, Design, Build, Test, Deploy, and Maintain. First, the stakeholders and designers Identify an issue. Next, the developer team Plan how to solve the issue. Third, the Design is explained to the stakeholders using a Design Specification. This step is vital for the project and may require a return to the planning phase to make sure all issues are satisfied. The next step is the Build step, where the development team writes the code for the software as detailed in the design step. Next is the Testing stage where the code is tested for all use cases to check for errors and defects. Next is the Deployment stage, where the code is integrated into the system. Finally, the development will continue to Maintain the project and keep it up to date.**
