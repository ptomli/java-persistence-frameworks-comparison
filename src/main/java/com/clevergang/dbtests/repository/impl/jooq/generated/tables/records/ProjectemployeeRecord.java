package com.clevergang.dbtests.repository.impl.jooq.generated.tables.records;


import com.clevergang.dbtests.repository.impl.jooq.generated.tables.Projectemployee;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectemployeeRecord extends UpdatableRecordImpl<ProjectemployeeRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1315411743;

    /**
     * Setter for <code>public.projectemployee.project_pid</code>.
     */
    public void setProjectPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.projectemployee.project_pid</code>.
     */
    public Integer getProjectPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.projectemployee.employee_pid</code>.
     */
    public void setEmployeePid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.projectemployee.employee_pid</code>.
     */
    public Integer getEmployeePid() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Projectemployee.PROJECTEMPLOYEE.PROJECT_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Projectemployee.PROJECTEMPLOYEE.EMPLOYEE_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getProjectPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEmployeePid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectemployeeRecord value1(Integer value) {
        setProjectPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectemployeeRecord value2(Integer value) {
        setEmployeePid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectemployeeRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProjectemployeeRecord
     */
    public ProjectemployeeRecord() {
        super(Projectemployee.PROJECTEMPLOYEE);
    }

    /**
     * Create a detached, initialised ProjectemployeeRecord
     */
    public ProjectemployeeRecord(Integer projectPid, Integer employeePid) {
        super(Projectemployee.PROJECTEMPLOYEE);

        set(0, projectPid);
        set(1, employeePid);
    }
}
