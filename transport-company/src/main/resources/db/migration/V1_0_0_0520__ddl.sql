CREATE TABLE IF NOT EXISTS terminal
(
    id bigint NOT NULL,
    name varchar(255),
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS product
(
    id bigint NOT NULL,
    name varchar(255),
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS supplier
(
    id bigint NOT NULL,
    name varchar(255),
    product_id bigint,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES product
);
CREATE TABLE IF NOT EXISTS public.order
(
    id bigint NOT NULL,
    total_weight integer,
    destiny_terminal_id bigint,
    origin_terminal_id bigint,
    supplier_id bigint,
    truck_driver_id bigint,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    PRIMARY KEY (id),
    FOREIGN KEY (destiny_terminal_id) REFERENCES terminal,
    FOREIGN KEY (origin_terminal_id) REFERENCES terminal,
    FOREIGN KEY  (supplier_id) REFERENCES supplier,
    FOREIGN KEY (truck_driver_id) REFERENCES truck_driver
);
CREATE TABLE IF NOT EXISTS truck
(
    id bigint NOT NULL,
    name varchar(255),
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS truck_driver
(
    id bigint NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    truck_id bigint,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    PRIMARY KEY (id),
    FOREIGN KEY (truck_id) REFERENCES truck
);

