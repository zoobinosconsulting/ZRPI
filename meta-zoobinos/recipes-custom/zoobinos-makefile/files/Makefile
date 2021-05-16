CC ?= gcc
CFLAGS += -Wall

EXE = hellomakefile

OBJS = hellomakefile.o

all: $(EXE)

clean:
	rm -f $(OBJS) $(EXE)

install:
	mkdir -p $(DESTDIR)
	cp $(EXE) $(DESTDIR)

