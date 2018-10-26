package ms3.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Course service. Represents a row in the &quot;train_Course&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ms3.service.model.impl.CourseModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ms3.service.model.impl.CourseImpl}.
 * </p>
 *
 * @author jackt
 * @see Course
 * @see ms3.service.model.impl.CourseImpl
 * @see ms3.service.model.impl.CourseModelImpl
 * @generated
 */
public interface CourseModel extends BaseModel<Course> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a course model instance should use the {@link Course} interface instead.
     */

    /**
     * Returns the primary key of this course.
     *
     * @return the primary key of this course
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this course.
     *
     * @param primaryKey the primary key of this course
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the title of this course.
     *
     * @return the title of this course
     */
    @AutoEscape
    public String getTitle();

    /**
     * Sets the title of this course.
     *
     * @param title the title of this course
     */
    public void setTitle(String title);

    /**
     * Returns the description of this course.
     *
     * @return the description of this course
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this course.
     *
     * @param description the description of this course
     */
    public void setDescription(String description);

    /**
     * Returns the list price of this course.
     *
     * @return the list price of this course
     */
    @AutoEscape
    public String getListPrice();

    /**
     * Sets the list price of this course.
     *
     * @param listPrice the list price of this course
     */
    public void setListPrice(String listPrice);

    /**
     * Returns the provider of this course.
     *
     * @return the provider of this course
     */
    @AutoEscape
    public String getProvider();

    /**
     * Sets the provider of this course.
     *
     * @param provider the provider of this course
     */
    public void setProvider(String provider);

    /**
     * Returns the course ID of this course.
     *
     * @return the course ID of this course
     */
    public long getCourseId();

    /**
     * Sets the course ID of this course.
     *
     * @param courseId the course ID of this course
     */
    public void setCourseId(long courseId);

    /**
     * Returns the estimated hours of this course.
     *
     * @return the estimated hours of this course
     */
    public double getEstimatedHours();

    /**
     * Sets the estimated hours of this course.
     *
     * @param estimatedHours the estimated hours of this course
     */
    public void setEstimatedHours(double estimatedHours);

    /**
     * Returns the sections of this course.
     *
     * @return the sections of this course
     */
    @AutoEscape
    public String getSections();

    /**
     * Sets the sections of this course.
     *
     * @param sections the sections of this course
     */
    public void setSections(String sections);

    /**
     * Returns the skills of this course.
     *
     * @return the skills of this course
     */
    @AutoEscape
    public String getSkills();

    /**
     * Sets the skills of this course.
     *
     * @param skills the skills of this course
     */
    public void setSkills(String skills);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(ms3.service.model.Course course);

    @Override
    public int hashCode();

    @Override
    public CacheModel<ms3.service.model.Course> toCacheModel();

    @Override
    public ms3.service.model.Course toEscapedModel();

    @Override
    public ms3.service.model.Course toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}