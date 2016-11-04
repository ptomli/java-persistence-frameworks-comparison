package com.clevergang.dbtests.repository.impl.jooq.generated.tables;


import com.clevergang.dbtests.repository.impl.jooq.generated.Keys;
import com.clevergang.dbtests.repository.impl.jooq.generated.Public;
import com.clevergang.dbtests.repository.impl.jooq.generated.tables.records.DepartmentRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


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
public class Department extends TableImpl<DepartmentRecord> {

    private static final long serialVersionUID = -1890573995;

    /**
     * The reference instance of <code>public.department</code>
     */
    public static final Department DEPARTMENT = new Department();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DepartmentRecord> getRecordType() {
        return DepartmentRecord.class;
    }

    /**
     * The column <code>public.department.pid</code>.
     */
    public final TableField<DepartmentRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('department_pid_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.department.company_pid</code>.
     */
    public final TableField<DepartmentRecord, Integer> COMPANY_PID = createField("company_pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.department.name</code>.
     */
    public final TableField<DepartmentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>public.department</code> table reference
     */
    public Department() {
        this("department", null);
    }

    /**
     * Create an aliased <code>public.department</code> table reference
     */
    public Department(String alias) {
        this(alias, DEPARTMENT);
    }

    private Department(String alias, Table<DepartmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Department(String alias, Table<DepartmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DepartmentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DEPARTMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DepartmentRecord> getPrimaryKey() {
        return Keys.DEPARTMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DepartmentRecord>> getKeys() {
        return Arrays.<UniqueKey<DepartmentRecord>>asList(Keys.DEPARTMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DepartmentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DepartmentRecord, ?>>asList(Keys.DEPARTMENT__DEPARTMENT_COMPANY_PID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Department as(String alias) {
        return new Department(alias, this);
    }

    /**
     * Rename this table
     */
    public Department rename(String name) {
        return new Department(name, null);
    }
}
